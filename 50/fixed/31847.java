@java.lang.Override
public void steppedOffYou(main.Robot r) {
    while (robots.contains(r)) {
        robots.remove(r);
    } 
}