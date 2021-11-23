private void recalculateStats() {
    java.lang.System.out.println("Was run");
    equipped_stats_pack_.reset();
    if ((primary_hand_) != null) {
        java.lang.System.out.println(primary_hand_.getStatsPack());
        equipped_stats_pack_.addOn(primary_hand_.getStatsPack());
    }
    if ((secondary_hand_) != null) {
        equipped_stats_pack_.addOn(secondary_hand_.getStatsPack());
    }
}