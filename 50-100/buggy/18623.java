@java.lang.Override
public void doTimeStep() {
    age += 1;
    if ((getEnergy()) < 100) {
        walk(dir);
    }else {
        int flip = project4.Critter.getRandomInt(2);
        if (flip == 1) {
            walk(dir);
        }else {
            dir = project4.Critter.getRandomInt(8);
        }
    }
    if ((getEnergy()) > 150) {
        project4.ReeceCritter1 newReece1 = new project4.ReeceCritter1();
        reproduce(newReece1, project4.Critter.getRandomInt(8));
    }
}