public int plateJudge(java.util.Vector<org.easypr.core.Mat> inVec, java.util.Vector<org.easypr.core.Mat> resultVec) {
    for (int j = 0; j < (inVec.size()); j++) {
        org.easypr.core.Mat inMat = inVec.get(j);
        imwrite((("tmp" + (java.lang.Integer.valueOf(j).toString())) + ".jpg"), inMat);
        if (1 == (plateJudge(inMat)))
            resultVec.add(inMat);
        
    }
    return 0;
}