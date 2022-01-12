@java.lang.Override
public int compareTo(final de.interactive_instruments.etf.dal.dao.PreparedDtoCollection o) {
    if (!(o instanceof de.interactive_instruments.etf.dal.dao.PreparedDtoCollection)) {
        return -1;
    }
    final de.interactive_instruments.etf.dal.dao.basex.BsxPreparedDtoCollection bsxO = ((de.interactive_instruments.etf.dal.dao.basex.BsxPreparedDtoCollection) (o));
    return this.bsXquery.toString().compareTo(bsxO.bsXquery.toString());
}