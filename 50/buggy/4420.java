public static double Completion(mck.MatlabEngine eng) {
    double dProgress1 = mck.MCK.GetRBVectorLength(sRightFoot);
    double dProgress2 = mck.MCK.GetRBVectorLength(sLeftFoot);
    double dCompletion = (dProgress1 + dProgress2) / (2.0 * (dStartToBox));
    return dCompletion;
}