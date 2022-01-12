public int compare(java.util.Map.Entry<Repository, DataCount> o1, java.util.Map.Entry<Repository, DataCount> o2) {
    return o1.getValue().getActivity(false).compareTo(o2.getValue().getActivity(false));
}