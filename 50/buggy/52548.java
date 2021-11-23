public void UpdateBGL(team5.diabetesself_managmentapp.BGL bgl) {
    java.lang.System.out.println(((("Updating: " + (bgl.get_id())) + " ") + (bgl.get_value())));
    db.UpdateBGL(bgl);
}