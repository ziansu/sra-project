private java.lang.String choicePick(graduationProject.Domain.Request request, int size, int serviceId, java.lang.String mode) {
    java.util.List<java.lang.Integer> targetList = generateRanNumList(size, choiceRate);
    java.lang.String target = "pod1";
    if (mode.equals("choice1"))
        target = getBetterPod1(request, targetList, serviceId);
    
    return target;
}