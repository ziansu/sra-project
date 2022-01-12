public void compete() {
    if ((currentEvent) == null) {
        java.lang.System.out.println("hello");
        currentEvent = Event.NONE;
    }
    switch (currentEvent) {
        case CYCLING :
            cyclingComponent.Cycle();
            break;
        case RUNNING :
            runningComponent.Run();
            break;
        case SWIMMING :
            swimmingComponent.Swim();
            break;
        default :
            java.lang.System.out.println(((this.athleteName) + " can't compete"));
    }
}