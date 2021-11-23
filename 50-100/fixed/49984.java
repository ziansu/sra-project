public void makeSubstitution(models.MockPlayer out, models.MockPlayer in) {
    if ((!(onField.contains(out))) || (!(subs.contains(in)))) {
        return ;
    }else {
        onField.remove(out);
        subs.remove(in);
        onField.add(in);
        subs.add(out);
        if (out.equals(getCaptain())) {
            setCaptain(null);
        }
    }
    sort();
}