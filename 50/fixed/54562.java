public void actionPerformed(java.awt.event.ActionEvent e) {
    jdbcTw.updateResult(tweetList.get(currentPostId).getTweetid(), 0);
    actualizeText();
}