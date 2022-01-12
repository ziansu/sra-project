public int increaseCurrentManaBy(int amount) {
    if (amount < 0) {
        java.lang.System.err.println(("Warning! Current mana increasing function cannot increase mana by negative amount: " + amount));
        amount = 0;
    }
    if (((current_mana_) + amount) <= (max_mana_)) {
        current_mana_ += amount;
        return 0;
    }else {
        current_mana_ = max_mana_;
        return -1;
    }
}