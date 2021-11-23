@java.lang.Override
public void reduce(ldbc.snb.datagen.hadoop.BlockKey key, java.lang.Iterable<ldbc.snb.datagen.objects.Person> valueSet, ldbc.snb.datagen.hadoop.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.ArrayList<ldbc.snb.datagen.objects.Person> persons = new java.util.ArrayList<ldbc.snb.datagen.objects.Person>();
    for (ldbc.snb.datagen.objects.Person p : valueSet) {
        persons.add(new ldbc.snb.datagen.objects.Person(p));
    }
    context.setStatus(((("Generating person activity for block " + (key.block)) + " of size ") + (persons.size())));
    personActivityGenerator_.generateActivityForBlock(((int) (key.block)), persons);
}