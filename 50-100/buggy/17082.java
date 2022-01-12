@java.lang.Override
public int getItemViewType(int position) {
    java.lang.System.out.println(("match status : " + (dataSet.get(position).getMatchStatus())));
    java.lang.String matchStatus = dataSet.get(position).getMatchStatus().toUpperCase();
    switch (matchStatus) {
        case com.binodnme.epl.constants.ApplicationConstant.FT :
            return com.binodnme.epl.adapter.FixtureAdapter.MATCH_COMPLETE;
        case com.binodnme.epl.constants.ApplicationConstant.PM :
            return com.binodnme.epl.adapter.FixtureAdapter.MATCH_UPCOMING;
        case com.binodnme.epl.constants.ApplicationConstant.PP :
            return com.binodnme.epl.adapter.FixtureAdapter.MATCH_POSTPONED;
        default :
            return com.binodnme.epl.adapter.FixtureAdapter.MATCH_LIVE;
    }
}