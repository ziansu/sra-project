public static void addTimes(com.bearenterprises.sofiatraffic.fragments.TimeResultsFragment fragment, com.bearenterprises.sofiatraffic.restClient.second.Line line, java.util.List<com.bearenterprises.sofiatraffic.restClient.Time> times) {
    if (fragment == null) {
        return ;
    }
    fragment.addTimeSchedule(line, ((java.util.ArrayList<com.bearenterprises.sofiatraffic.restClient.Time>) (times)));
}