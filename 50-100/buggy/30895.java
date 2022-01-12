@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (getClass().equals(obj.getClass())) {
        okuki.Place p = ((okuki.Place) (obj));
        if ((data) == null) {
            return (p.getData()) == null;
        }else {
            return data.equals(p.getData());
        }
    }else {
        return false;
    }
}