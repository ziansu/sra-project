@java.lang.Override
public void run() {
    (s)++;
    int displays;
    int m;
    m = (s) / 60;
    displays = (s) % 60;
    update(displays, m);
}