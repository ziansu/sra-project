@java.lang.Override
public void onTick(long l) {
    db.insertSteps(((currentCount) - (countBase)));
    counts.add(((currentCount) - (countBase)));
    countBase = currentCount;
    (segmentCount)++;
    count.setText(((("Segment" + ((segmentCount) + 1)) + " steps: ") + ((currentCount) - (countBase))));
}