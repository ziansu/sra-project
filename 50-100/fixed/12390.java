@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof data.Emotion) {
        data.Emotion em = ((data.Emotion) (obj));
        return ((((em.name) == null) && ((this.name) == null)) || (em.name.equals(this.name))) && ((java.lang.Double.compare(em.intensity, this.intensity)) == 0);
    }
    return false;
}