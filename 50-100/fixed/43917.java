public Airplane generatePlane() {
    int salt = generator.nextInt(100);
    java.lang.String name = getPlaneName();
    if (salt > (PERCENTAGE_OF_PLANES_AS_PASSENGER)) {
        java.lang.System.out.println((name + " arrives."));
        return new CargoPlane(name, getPriority(), getSize());
    }else {
        java.lang.System.out.println((name + " arrives."));
        return new PassengerPlane(name, getPriority(), getSize());
    }
}