public static void main(java.lang.String[] args) {
    Car car1 = new Car(new ChillDriver("Chris Dunlop", 130), 800.0, 40.0, 5.0);
    Car car2;
    car2 = new Car(new AggressiveDriver("Ann Merriweather", 160), 400.0, 60.0, 7.0);
    Environment env = new Environment();
    env.cars.add(car1);
    env.cars.add(car2);
    java.lang.System.out.println("Success!");
}