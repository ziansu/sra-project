public java.util.List<io.jianxun.business.web.dto.ValueLabelDto> findByDepartAndStatusAndDeleted(io.jianxun.business.domain.Department department, java.lang.String name) {
    return getValueData(((io.jianxun.business.repository.StockInDetailRepository) (entityRepository)).findByDepartAndStatusAndDeletedAndName(department, BooleanStatus.False, name));
}