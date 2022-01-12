public java.util.List<dev.blunch.blunch.domain.PaymentMenu> getPaymentMenusOrderedByDate() {
    java.util.List<dev.blunch.blunch.domain.PaymentMenu> menus = paymentMenuRepository.all();
    java.util.List<dev.blunch.blunch.domain.PaymentMenu> result = new java.util.ArrayList<>();
    for (dev.blunch.blunch.domain.PaymentMenu menu : menus) {
        if ((menu.getDateEnd().compareTo(java.util.Calendar.getInstance().getTime())) < 0) {
            result.add(menu);
        }
    }
    java.util.Collections.sort(result, new dev.blunch.blunch.domain.MenuComparator());
    return result;
}