public void init() {
    for (int i = 0; i < 11; i++) {
        pa0_2.Packet init_packet = new pa0_2.Packet(sourcelist.get(i));
        pa0_2.Event init_event = new pa0_2.Event(init_packet, "arrival", this);
        timeline.add(init_event);
    }
    java.lang.System.out.println("The server is ready!");
}