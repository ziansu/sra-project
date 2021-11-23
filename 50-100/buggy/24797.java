public static void checkMov51() {
    if (((Data.LeftKneeAngl.MoCap[((Data.LeftKneeAngl.MoCap.length) - 1)]) < (dKneeStraight)) && ((Data.RightKneeAngl.MoCap[((Data.RightKneeAngl.MoCap.length) - 1)]) < (dKneeStraight))) {
        bMovement51Completed = true;
    }
}