public static void checkMov52() {
    if (((Data.LeftKneeAngl.MoCap[((Data.LeftKneeAngl.MoCap.length) - 1)]) > (dKneeStraight)) && ((Data.RightKneeAngl.MoCap[((Data.RightKneeAngl.MoCap.length) - 1)]) > (dKneeStraight))) {
        bMovement52Completed = true;
    }
}