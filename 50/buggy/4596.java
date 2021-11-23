public com.cooksys.butterpillar.model.Butterpillar catterflyToButterpillar(com.cooksys.butterpillar.model.Catterfly catterfly) {
    return new com.cooksys.butterpillar.model.Butterpillar(((catterfly.wingspan) / (leavesEatenToWeight)), ((catterfly.weight) / (lengthToWingspan)));
}