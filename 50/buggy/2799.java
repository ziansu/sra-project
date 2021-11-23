public void play() {
    begin = java.util.Calendar.getInstance();
    state = new jKMS.states.Play(instance);
    java.text.SimpleDateFormat ft = new java.text.SimpleDateFormat("HH:mm:ss");
    jKMS.LogicHelper.print(("Playing since: " + (ft.format(begin))));
}