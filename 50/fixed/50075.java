private in.ac.iitb.cse.carts.safestreet.model.Acceleration getSmoothenedAcceleration(in.ac.iitb.cse.carts.safestreet.model.Acceleration reorientedAcc) {
    smoothDataQueue.add(reorientedAcc);
    in.ac.iitb.cse.carts.safestreet.model.Acceleration ret = smoothDataQueue.getMean();
    return ret;
}