@java.lang.Override
public org.jasig.ssp.util.sort.PagingWrapper<org.jasig.ssp.model.reference.Blurb> getAll(org.jasig.ssp.util.sort.SortingAndPaging sAndP, java.lang.String code) {
    return dao.getAll(sAndP, code, null);
}