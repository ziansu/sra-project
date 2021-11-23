@org.junit.Before
public void before() throws com.sybit.airtable.exception.AirtableException {
    this.airtable = new com.sybit.airtable.Airtable().configure(new com.sybit.airtable.Configuration("123", "url"));
    this.base = new com.sybit.airtable.Base("base", this.airtable);
}