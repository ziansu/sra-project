public void levelUp() {
    if ((occupation_) == null) {
        src.controller.StatsPack new_stats = new src.controller.StatsPack(0, 1, 1, 1, 1, 1, 1, 1, 1);
        set_default_stats_pack(get_default_stats_pack_().add(new_stats));
    }
    set_default_stats_pack(occupation_.change_stats(get_default_stats_pack_()));
}