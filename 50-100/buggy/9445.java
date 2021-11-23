@java.lang.Override
public int compare(org.openlmis.referencedata.dto.ProcessingPeriodDto o1, org.openlmis.referencedata.dto.ProcessingPeriodDto o2) {
    switch (compareCondition) {
        case "startDate" :
            {
                return o1.getStartDate().compareTo(o2.getStartDate());
            }
        default :
            {
                throw new org.openlmis.referencedata.exception.ValidationMessageException(new org.openlmis.referencedata.util.Message(org.openlmis.referencedata.util.messagekeys.ProcessingPeriodMessageKeys.ERROR_INVALID_SORTING_COLUMN, compareCondition));
            }
    }
}