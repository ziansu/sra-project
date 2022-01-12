@java.lang.Override
public java.util.List<com.vn.ael.persistence.entity.Docsgeneral> searchExhibitionAccounting(com.vn.ael.webapp.dto.Search search) {
    return docsgeneralRepository.searchExhibitionAccounting(search.getCustomer(), search.getTypeOfImport(), search.getTypeOfContainer(), true, search.getServicesType(), search.getStartDate(), search.getEndDate());
}