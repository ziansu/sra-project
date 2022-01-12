@java.lang.Override
public void startAsync(it.unical.mat.embasp.base.Callback c, java.util.List<java.lang.Integer> program_index, java.util.List<java.lang.Integer> option_index) {
    java.util.List<it.unical.mat.embasp.base.InputProgram> input_programs = collect_programs(program_index);
    java.util.List<it.unical.mat.embasp.base.OptionDescriptor> input_options = collect_options(option_index);
    service.startAsync(c, input_programs, input_options);
}