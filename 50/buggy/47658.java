private int markToRate(com.burnevsky.firu.model.Mark mark) {
    int i = mark.toInt();
    return i <= (Mark.YetToLearn.toInt()) ? 0 : i - 1;
}