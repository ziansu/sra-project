public static void removeMultiple(int[] index) {
    for (int i : index) {
        com.vtewari.bunkconfidently.adapter.LectureListAdapter.list.remove(i);
    }
}