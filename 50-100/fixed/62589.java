public void sortData(java.util.ArrayList<com.festivent.hardeep.festivent.EventInfo> data) {
    java.util.Collections.sort(myEvents, new java.util.Comparator<com.festivent.hardeep.festivent.EventInfo>() {
        @java.lang.Override
        public int compare(com.festivent.hardeep.festivent.EventInfo lhs, com.festivent.hardeep.festivent.EventInfo rhs) {
            return lhs.getStartDate().compareTo(rhs.getStartDate());
        }
    });
}