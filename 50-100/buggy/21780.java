public org.smartea.beaker.example.regulation.frontdesk.core.entity.AccessCard method1(org.smartea.beaker.example.regulation.frontdesk.core.entity.Guest guest) throws org.smartea.beaker.example.regulation.frontdesk.core.entity.AccessDenied {
    if (freshManRepository.isFreshMan(guest)) {
        try {
            org.smartea.beaker.example.regulation.frontdesk.core.entity.Employee employee = freshManRepository.getFreshMan(guest);
            return accessCardBuilder.make(employee);
        } catch (org.smartea.beaker.example.regulation.frontdesk.core.dict.MakeAccessCardFailedReason buildAccessCardFailedReason) {
            throw new org.smartea.beaker.example.regulation.frontdesk.core.entity.AccessDenied();
        }
    }else {
        try {
            return accessCardBuilder.make(guest);
        } catch (org.smartea.beaker.example.regulation.frontdesk.core.dict.MakeAccessCardFailedReason makeAccessCardFailedReason) {
            throw new org.smartea.beaker.example.regulation.frontdesk.core.entity.AccessDenied();
        }
    }
}