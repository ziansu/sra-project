private static void mergeInfo(com.mycar.service.impl.Order l, com.mycar.service.impl.Order r) {
    if ((r.getPay_info()) != null)
        l.setPay_info(com.mycar.logic.VehicleCostLogic.mergeInfo(l.getPay_info(), r.getPay_info()));
    
    if ((r.getCost_info()) != null)
        l.setCost_info(com.mycar.logic.VehicleCostLogic.mergeInfo(l.getPay_info(), r.getCost_info()));
    
}