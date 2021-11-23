public void onUpdate(Controler.Fsm fsm) {
    ((Model.Taxi) (fsm.owner())).pasear();
    java.lang.System.out.print(((("TAXI" + (fsm.id())) + "  ") + "paseando"));
}