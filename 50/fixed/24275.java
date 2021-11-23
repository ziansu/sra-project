@java.lang.Override
public boolean add(ijfx.core.formats.Script t) {
    if ((size()) == 0) {
        return super.add(t);
    }else {
        super.set(0, t);
        return true;
    }
}