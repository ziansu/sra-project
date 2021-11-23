static firststep.Font find(java.lang.String name) {
    java.lang.ref.WeakReference<firststep.Font> f = firststep.Font.allFonts.get(name);
    if (f != null) {
        return f.get();
    }else {
        return null;
    }
}