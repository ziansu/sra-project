public static void generate_predicates() {
    for (int current_depth = Depths.highest_depth; current_depth > 0; --current_depth) {
        Predicates.add_entry(Depths.DEPTHS_OUTPUT, "is_lower_than", Depths.get_id_from_depth(new java.lang.Integer((current_depth - 1))), Depths.get_id_from_depth(new java.lang.Integer(current_depth)));
    }
}