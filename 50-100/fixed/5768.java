private void recalculateStats() {
    equipped_stats_pack_.reset();
    if ((primary_hand_) != null) {
        equipped_stats_pack_.addOn(primary_hand_.getStatsPack());
    }
    if ((secondary_hand_) != null) {
        equipped_stats_pack_.addOn(secondary_hand_.getStatsPack());
    }
}