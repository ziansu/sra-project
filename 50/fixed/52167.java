@java.lang.Override
public int compare(dat255.refugeemap.model.db.Event e1, dat255.refugeemap.model.db.Event e2) {
    return strComp.compare(e2.getTitle(), e1.getTitle());
}