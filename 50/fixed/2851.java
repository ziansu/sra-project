@java.lang.Override
public final java.util.List<com.nagarro.gde.dto.AllApplicationAdvanceDataDTO> getApplicationDataListExtended(final com.nagarro.gde.dto.AllApplicationFilterDto allApplicationFilterDto) throws com.nagarro.gde.persistence.dao.exception.UserException {
    return getApplicationDataListExtended(allApplicationFilterDto, null, null);
}