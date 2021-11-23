@java.lang.Override
public void steppedOffYou(main.Robot r) {
    if (robots.contains(r)) {
        robots.remove(r);
    }
}