public static boolean isEndingQuat(raft.jpct.bones.Quaternion msg) {
    return ((((msg.getX()) == (com.example.chris.myapplication.MyoHelper.END_FLAG)) && ((msg.getY()) == (com.example.chris.myapplication.MyoHelper.END_FLAG))) && ((msg.getZ()) == (com.example.chris.myapplication.MyoHelper.END_FLAG))) && ((msg.getW()) == (com.example.chris.myapplication.MyoHelper.END_FLAG));
}