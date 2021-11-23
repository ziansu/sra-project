void markAsLocalLoss(short atDepth, org.ggp.base.util.propnet.polymorphic.forwardDeadReckon.ForwardDeadReckonLegalMoveInfo withMove) {
    if (!(mComplete)) {
        mLocalSearchStatus = org.ggp.base.player.gamer.statemachine.sancho.TreeNode.LocalSearchStatus.LOCAL_SEARCH_LOSS;
        mCompletionDepth = ((short) ((mDepth) + atDepth));
    }
}