public void bindToNewMapOfSize(int x, int y) {
    if ((src.model.MapMain_Relation.number_of_worlds_generated_) >= (src.model.MapMain_Relation.MAX_NUMBER_OF_WORLDS)) {
        current_map_reference_ = new src.model.Map(x, y);
        ++(src.model.MapMain_Relation.number_of_worlds_generated_);
    }else {
        java.lang.System.err.println(("Number of world allowed: " + (src.model.MapMain_Relation.MAX_NUMBER_OF_WORLDS)));
        java.lang.System.err.println(("Number of worlds already in existence: " + (src.model.MapMain_Relation.number_of_worlds_generated_)));
        java.lang.System.err.println((("Please don't make more than " + (src.model.MapMain_Relation.MAX_NUMBER_OF_WORLDS)) + " worlds."));
        java.lang.System.exit((-1));
    }
}