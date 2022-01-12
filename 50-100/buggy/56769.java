@java.lang.Override
public int compare(technology.tabula.Ruling a, technology.tabula.Ruling b) {
    return ((int) (!(technology.tabula.Utils.feq(a.getPosition(), b.getPosition())) ? (a.getPosition()) - (b.getPosition()) : (a.getStart()) - (b.getStart())));
}