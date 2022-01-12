@java.lang.Override
public void run() {
    while (true) {
        while (!(isSearching())) {
            try {
                java.lang.Thread.sleep(50);
            } catch (java.lang.InterruptedException ire) {
            }
            if (mExit)
                return ;
            
        } 
        mSearcherDone = false;
        mSearcher.go();
        de.htwsaar.chessbot.engine.search.SearchWorker.infoHash(mSearcher.getHashTable().usage());
        de.htwsaar.chessbot.engine.search.SearchWorker.infoBestmove(mSearcher.getBestMove(), mSearcher.getPonderMove());
        mSearcherDone = true;
        stopSearching();
    } 
}