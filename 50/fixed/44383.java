public void onUpdate(Controler.Fsm fsm) {
    ((Model.Taxi) (fsm.owner())).pasear();
    java.lang.System.out.println(((("TAXI" + (fsm.id())) + "  ") + "paseando"));
}