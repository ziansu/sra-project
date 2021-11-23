@java.lang.Override
public int getItemViewType(int position) {
    if ((match.getGameStatus().breakType) == (com.brookmanholmes.billiards.game.util.BreakType.GHOST)) {
        if (position == 0)
            return com.brookmanholmes.billiardmatchanalyzer.adapters.matchinfo.MatchInfoRecyclerAdapter.ITEM_MATCH_OVERVIEW;
        else
            if (position == 1)
                return com.brookmanholmes.billiardmatchanalyzer.adapters.matchinfo.MatchInfoRecyclerAdapter.ITEM_SHOOTING_PCT;
            else
                if (position == 2)
                    return com.brookmanholmes.billiardmatchanalyzer.adapters.matchinfo.MatchInfoRecyclerAdapter.ITEM_BREAKS;
                else
                    return com.brookmanholmes.billiardmatchanalyzer.adapters.matchinfo.MatchInfoRecyclerAdapter.ITEM_FOOTER;
                
            
        
    }
    if (position == (getItemCount()))
        return com.brookmanholmes.billiardmatchanalyzer.adapters.matchinfo.MatchInfoRecyclerAdapter.ITEM_FOOTER;
    else
        return position;
    
}