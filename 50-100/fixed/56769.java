@java.lang.Override
public int compare(technology.tabula.Ruling a, technology.tabula.Ruling b) {
    final float diff = (a.getPosition()) - (b.getPosition());
    return java.lang.Float.compare((diff == 0 ? (a.getStart()) - (b.getStart()) : diff), 0.0F);
}