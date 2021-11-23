private void taskThree(java.util.List<com.allirey.Soldier> list, int id) {
    int count = 0;
    for (com.allirey.Soldier s : list) {
        if (((s.isCommander(list.get((id - 1)))) && (s.isAvailable())) && (!(s.equals(list.get((id - 1)))))) {
            count++;
        }
    }
    java.lang.System.out.println(count);
}